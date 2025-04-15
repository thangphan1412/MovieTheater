import '../assets/footer.css'
function Footer() {
    return(
        <div className="footer">
                <hr></hr>
            <div className="footer-container">
                <div className="footer-left">
                    <h5>Thông tin</h5>
                    <p>Địa chỉ: 123 Đường ABC, TP. XYZ</p>
                    <p>Giờ làm việc: 8:00 - 17:00</p>
                </div>
                <div className="footer-right">
                    <h5>Liên Hệ</h5>
                    <p>Email: lienhe@example.com</p>
                    <p>Điện thoại: 0123 456 789</p>
                </div>
            </div>
        </div>
    );
}

export default Footer;