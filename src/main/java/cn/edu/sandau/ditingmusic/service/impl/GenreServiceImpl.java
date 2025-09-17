package cn.edu.sandau.ditingmusic.service.impl;

import cn.edu.sandau.ditingmusic.model.entity.Genre;
import cn.edu.sandau.ditingmusic.mapper.GenreMapper;
import cn.edu.sandau.ditingmusic.service.IGenreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sunpingli
 * @since 2025-01-09
 */
@Service
public class GenreServiceImpl extends ServiceImpl<GenreMapper, Genre> implements IGenreService {

}
