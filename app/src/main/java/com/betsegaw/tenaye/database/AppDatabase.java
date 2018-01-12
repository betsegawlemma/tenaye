package com.betsegaw.tenaye.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.betsegaw.tenaye.daos.CategoryDao;
import com.betsegaw.tenaye.daos.ChoiceDao;
import com.betsegaw.tenaye.daos.ContactUsDao;
import com.betsegaw.tenaye.daos.ExpertAnswerDao;
import com.betsegaw.tenaye.daos.ForumDao;
import com.betsegaw.tenaye.daos.MemberDao;
import com.betsegaw.tenaye.daos.NewsDao;
import com.betsegaw.tenaye.daos.QuestionDao;
import com.betsegaw.tenaye.daos.QuestionWithChoiceDao;
import com.betsegaw.tenaye.daos.ServiceDao;
import com.betsegaw.tenaye.daos.StoryCommentDao;
import com.betsegaw.tenaye.daos.StoryDao;
import com.betsegaw.tenaye.daos.StudentQuestionDao;
import com.betsegaw.tenaye.daos.TopicDao;
import com.betsegaw.tenaye.daos.UserDao;
import com.betsegaw.tenaye.entities.Category;
import com.betsegaw.tenaye.entities.Choice;
import com.betsegaw.tenaye.entities.ContactUs;
import com.betsegaw.tenaye.entities.ExpertAnswer;
import com.betsegaw.tenaye.entities.Forum;
import com.betsegaw.tenaye.entities.Member;
import com.betsegaw.tenaye.entities.News;
import com.betsegaw.tenaye.entities.Question;
import com.betsegaw.tenaye.entities.QuestionWithChoice;
import com.betsegaw.tenaye.entities.Service;
import com.betsegaw.tenaye.entities.Story;
import com.betsegaw.tenaye.entities.StoryComment;
import com.betsegaw.tenaye.entities.StudentQuestion;
import com.betsegaw.tenaye.entities.Topic;
import com.betsegaw.tenaye.entities.User;

/**
 * Created by betsegaw on 1/12/18.
 */
@Database(entities = {Category.class, Choice.class, ContactUs.class, ExpertAnswer.class,
        Forum.class, Member.class, News.class, Question.class, QuestionWithChoice.class,
        Service.class, Story.class, StoryComment.class, StudentQuestion.class, Topic.class, User.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CategoryDao categoryDao();
    public abstract ChoiceDao choiceDao();
    public abstract ContactUsDao contactUsDao();
    public abstract ExpertAnswerDao expertAnswerDao();
    public abstract ForumDao forumDao();
    public abstract MemberDao memberDao();
    public abstract NewsDao newsDao();
    public abstract QuestionDao questionDao();
    public abstract QuestionWithChoiceDao questionWithChoiceDao();
    public abstract ServiceDao serviceDao();
    public abstract StoryCommentDao storyCommentDao();
    public abstract StoryDao storyDao();
    public abstract StudentQuestionDao studentQuestionDao();
    public abstract TopicDao topicDao();
    public abstract UserDao userDao();
}
