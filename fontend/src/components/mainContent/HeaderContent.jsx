import React from 'react';
import '../../assets/css/componentCss/contentmainCss/headeContent.css'
export default function HeaderContent() {
    return(
        <div className="header">
            <div className="content">
                <a href="">Phim Sắp Chiếu</a>
            </div>
            <div className="content">
                <a href="">Phim Đang Chiếu</a>
            </div>
            <div className="content">
                <a href="">Suất Chiếu Đặc Biệt</a>
            </div>

        </div>
    )
}