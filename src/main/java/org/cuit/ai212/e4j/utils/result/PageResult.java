package org.cuit.ai212.e4j.utils.result;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Pymjl
 * @date 2022/1/21 22:00
 */

public class PageResult<T> implements Iterable<T>, Serializable {
    private static final long serialVersionUID = -3720998571176536865L;

    /**
     * 数据条数
     */
    private List<T> records = new ArrayList<>();

    /**
     * 一共有多少条数据
     */
    private long totalElements;

    /**
     * 当前页数
     */
    private long currentPage;

    /**
     * 一页数据最多有多少条数据
     */
    private long pageSize;

    /**
     * 一共有多少页
     */
    private long totalPages;

    /**
     * 当前页数有多少条数据
     */
    private int numberOfElements;

    public PageResult() {
    }

    /**
     * 构造方法，只用把原来的page类放进来即可
     *
     * @param page 查出来的分页对象
     */
    public PageResult(Page<T> page) {
        this.records = page.getRecords();
        this.totalElements = page.getTotal();
        this.currentPage = page.getCurrent();
        this.pageSize = page.getSize();
        this.numberOfElements = page.getRecords().size();
        this.totalPages = page.getPages();
    }

    /**
     * 是否有前一页
     *
     * @return boolean
     */
    public boolean hasPrevious() {
        return getCurrentPage() > 0;
    }

    /**
     * 是否有下一页
     *
     * @return boolean
     */
    public boolean hasNext() {
        return getCurrentPage() + 1 < getTotalPages();
    }

    /**
     * 获取总的页数
     *
     * @return long
     */
    private long getTotalPages() {
        return this.totalPages;
    }


    /**
     * 获取当前页的数据
     *
     * @return List<T>
     */
    public List<T> getRecords() {
        return Collections.unmodifiableList(records);
    }

    /**
     * 设置内容
     *
     * @param records 内容
     */
    public void setRecords(List<T> records) {
        this.records = records;
    }

    /**
     * 是否有内容
     *
     * @return boolean
     */
    public boolean hasRecords() {
        return getNumberOfElements() > 0;
    }

    /**
     * 获取单页大小
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * 设置单页大小
     */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获取全部元素数目
     */
    public long getTotalElements() {
        return totalElements;
    }

    /**
     * 设置全部元素数目
     */
    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }


    /**
     * 获取当前页号
     */
    public Long getCurrentPage() {
        return currentPage;
    }

    /**
     * 设置当前页号
     */
    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }


    /**
     * 获取单页元素数目
     */
    public int getNumberOfElements() {
        return numberOfElements;
    }

    /**
     * 设置单页元素数目
     */
    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }


    /**
     * 迭代器
     */
    @Override
    public Iterator<T> iterator() {
        return getRecords().iterator();
    }
}
