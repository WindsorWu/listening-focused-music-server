package cn.edu.sandau.ditingmusic.service;

import cn.edu.sandau.ditingmusic.model.dto.FeedbackDTO;
import cn.edu.sandau.ditingmusic.model.entity.Feedback;
import cn.edu.sandau.ditingmusic.result.PageResult;
import cn.edu.sandau.ditingmusic.result.Result;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author sunpingli
 * @since 2025-01-09
 */
public interface IFeedbackService extends IService<Feedback> {

    // 获取反馈列表
    Result<PageResult<Feedback>> getAllFeedbacks(FeedbackDTO feedbackDTO);

    // 删除反馈
    Result deleteFeedback(Long feedbackId);

    // 批量删除反馈
    Result deleteFeedbacks(List<Long> feedbackIds);

    // 添加反馈
    Result addFeedback(String content);

}
