package org.cuit.ai212.e4j;

import org.cuit.ai212.e4j.domain.*;
import org.cuit.ai212.e4j.mapper.*;
import org.cuit.ai212.e4j.utils.QuestionType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExamForJavaApplicationTests {
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    ChoiceQuestionMapper questionMapper;
    @Autowired
    OptionMapper optionMapper;
    @Autowired
    ProblemSetMapper setMapper;
    @Autowired
    ProblemSetChoiceQuestionMapper bindingMapper;
    @Autowired
    ExerciseRecordMapper recordMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void mybatisPlusTest(){

        //生成测试数据
        Teacher teacher = new Teacher(1, "12345678910", "test", "13456");
        Student stu = new Student(2021132079, "test1", "123456");
        ChoiceQuestion question = new ChoiceQuestion(1, "this is a test", false, 1);
        Option op = new Option(1,1,1,"testop", true);
        ProblemSet set = new ProblemSet(1, "testSet", false, true, 1);
        ProblemSetChoiceQuestion binding = new ProblemSetChoiceQuestion(1,1, 1, 0, 8);
        ExerciseRecord re = new ExerciseRecord(1,2021132079, 1, QuestionType.ChoiceQuestion, 0, 5, "Hello World!");

        //开始测试各个mapper功能
//        teacherMapper.insert(teacher); 已通过
//        studentMapper.insert(stu); 已通过
//        questionMapper.insert(question);已通过
//        optionMapper.insert(op);已通过
//        setMapper.insert(set);已通过
//        bindingMapper.insert(binding);已通过
//        recordMapper.insert(re);已通过


    }

}
