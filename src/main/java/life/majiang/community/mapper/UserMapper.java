package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @authoer:fjf
 * @createDate:2022/6/18
 * @description:
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,gmt_create,gmt_update) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtUpdate})")
    void insert(User user);


}
