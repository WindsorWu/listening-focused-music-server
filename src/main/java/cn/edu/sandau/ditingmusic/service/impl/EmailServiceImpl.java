package cn.edu.sandau.ditingmusic.service.impl;

import cn.edu.sandau.ditingmusic.service.EmailService;
import cn.edu.sandau.ditingmusic.util.RandomCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类（测试模式：控制台输出验证码，无需SMTP）
 * </p>
 *
 * @author sunpingli
 * @since 2025-01-09
 */
@Slf4j
@Service
public class EmailServiceImpl implements EmailService {

    /**
     * 发送邮件（测试模式：仅控制台输出）
     *
     * @param to      收件人地址
     * @param subject 邮件主题
     * @param content 邮件内容
     * @return 发送结果，固定为 true
     */
    public boolean sendEmail(String to, String subject, String content) {
        // 控制台输出模拟发送
        log.info("[TEST EMAIL] to: {} | subject: {} | content: {}", to, subject, content);
        System.out.println("[TEST EMAIL] to: " + to + " | subject: " + subject + " | content: " + content);
        return true;
    }

    /**
     * 发送验证码邮件（测试模式：仅控制台输出验证码并返回）
     *
     * @param email 收件人地址
     * @return 验证码
     */
    public String sendVerificationCodeEmail(String email) {
        String verificationCode = RandomCodeUtil.generateRandomCode();
        String subject = "【Vibe Music】验证码";
        String content = "您的验证码为：" + verificationCode;
        // 控制台输出验证码
        log.info("[TEST VERIFICATION CODE] email: {} | code: {}", email, verificationCode);
        System.out.println("[TEST VERIFICATION CODE] email: " + email + " | code: " + verificationCode);
        // 模拟发送（打印）
        sendEmail(email, subject, content);
        return verificationCode;
    }
}
