package cn.edu.sandau.ditingmusic.service;

import cn.edu.sandau.ditingmusic.model.dto.PlaylistAddDTO;
import cn.edu.sandau.ditingmusic.model.dto.PlaylistDTO;
import cn.edu.sandau.ditingmusic.model.dto.PlaylistUpdateDTO;
import cn.edu.sandau.ditingmusic.model.entity.Playlist;
import cn.edu.sandau.ditingmusic.model.vo.PlaylistDetailVO;
import cn.edu.sandau.ditingmusic.model.vo.PlaylistVO;
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
public interface IPlaylistService extends IService<Playlist> {

    // 获取所有歌单
    Result<PageResult<PlaylistVO>> getAllPlaylists(PlaylistDTO playlistDTO);

    // 获取所有歌单
    Result<PageResult<Playlist>> getAllPlaylistsInfo(PlaylistDTO playlistDTO);

    // 获取推荐歌单
    Result<List<PlaylistVO>> getRecommendedPlaylists(HttpServletRequest request);

    // 根据id获取歌单详情
    Result<PlaylistDetailVO> getPlaylistDetail(Long playlistId, HttpServletRequest request);

    // 获取所有歌单数量
    Result<Long> getAllPlaylistsCount(String style);

    // 添加歌单
    Result addPlaylist(PlaylistAddDTO playlistAddDTO);

    // 更新歌单
    Result updatePlaylist(PlaylistUpdateDTO playlistUpdateDTO);

    // 更新歌单封面
    Result updatePlaylistCover(Long playlistId, String coverUrl);

    // 删除歌单
    Result deletePlaylist(Long playlistId);

    // 批量删除歌单
    Result deletePlaylists(List<Long> playlistIds);

}
