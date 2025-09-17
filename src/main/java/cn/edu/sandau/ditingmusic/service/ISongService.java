package cn.edu.sandau.ditingmusic.service;

import cn.edu.sandau.ditingmusic.model.dto.SongAddDTO;
import cn.edu.sandau.ditingmusic.model.dto.SongAndArtistDTO;
import cn.edu.sandau.ditingmusic.model.dto.SongDTO;
import cn.edu.sandau.ditingmusic.model.dto.SongUpdateDTO;
import cn.edu.sandau.ditingmusic.model.entity.Song;
import cn.edu.sandau.ditingmusic.model.vo.SongAdminVO;
import cn.edu.sandau.ditingmusic.model.vo.SongDetailVO;
import cn.edu.sandau.ditingmusic.model.vo.SongVO;
import cn.edu.sandau.ditingmusic.result.PageResult;
import cn.edu.sandau.ditingmusic.result.Result;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author sunpingli
 * @since 2025-01-09
 */
public interface ISongService extends IService<Song> {

    // 获取所有歌曲
    Result<PageResult<SongVO>> getAllSongs(SongDTO songDTO, HttpServletRequest request);

    // 获取所有歌曲
    Result<PageResult<SongAdminVO>> getAllSongsByArtist(SongAndArtistDTO songDTO);

    // 获取推荐歌曲
    Result<List<SongVO>> getRecommendedSongs(HttpServletRequest request);

    // 根据id获取歌曲详情
    Result<SongDetailVO> getSongDetail(Long songId, HttpServletRequest request);

    // 获取所有歌曲数量
    Result<Long> getAllSongsCount(String style);

    // 添加歌曲信息
    Result addSong(SongAddDTO songAddDTO);

    // 更新歌曲信息
    Result updateSong(SongUpdateDTO songUpdateDTO);

    // 更新歌曲封面
    Result updateSongCover(Long songId, String coverUrl);

    // 更新歌曲音频
    Result updateSongAudio(Long songId, String audioUrl);

    // 删除歌曲
    Result deleteSong(Long songId);

    // 批量删除歌曲
    Result deleteSongs(List<Long> songIds);

}
