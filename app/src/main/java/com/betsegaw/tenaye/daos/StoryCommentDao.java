package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.StoryComment;

import java.util.Date;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface StoryCommentDao extends BaseDao<StoryComment>{
    @Query("SELECT * FROM story_comments where story_id = :storyId")
    public Set<StoryComment> findByStoryId(Long storyId);
    @Query("SELECT * FROM story_comments WHERE story_id = :storyId AND date >= :date")
    public Set<StoryComment> findByStoryIdAndDate(Long storyId, Date date);
    @Query("SELECT * FROM story_comments WHERE story_id = :storyId AND status IN (:statuses)")
    public Set<StoryComment> findByStoryIdAndStatuses(Long storyId, Set<String> statuses);
    @Query("SELECT * FROM story_comments WHERE story_id = :storyId AND rank >= :rank")
    public Set<StoryComment> findByStoryIdAndRank(Long storyId, Long rank);
}
