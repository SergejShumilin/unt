package com.module.example.maper;

import com.module.example.connection.GiftCertificate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GiftCertificatesMapper implements RowMapper<GiftCertificate> {
    @Override
    public GiftCertificate mapRow(ResultSet rs, int rowNum) throws SQLException {
        GiftCertificate giftCertificate = new GiftCertificate();
        giftCertificate.setId(rs.getInt("id"));
        giftCertificate.setName(rs.getString("name"));
        giftCertificate.setDescription(rs.getString("description"));
        giftCertificate.setPrice(rs.getInt("price"));
        giftCertificate.setCreateDate(rs.getString("create_date"));
        giftCertificate.setLastUpdateDate(rs.getString("last_update_date"));
        giftCertificate.setDuration(rs.getInt("duration"));
//        giftCertificate.setTagList(rs.getInt("tag_id"));
        return giftCertificate;
    }
}
