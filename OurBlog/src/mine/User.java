package mine;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



public class User {
	String Username;//�ǳ�
	String account;//�˺�
	String Password;//����
	String sex;
	String QQ;//qq
	String Mail;//����
	String Personal;//����˵��
	ArrayList<Post> Posts =new ArrayList<Post>();//����
	String date;//����ʱ��
	String Picture;
	String Other;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, String account, String password, String qQ,
			String mail, String personal, String picture,String other) {
		super();
		Username = username;
		this.account = account;
		Password = password;
		QQ = qQ;
		Mail = mail;
		Personal = personal;
		SimpleDateFormat datee =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.date = datee.format(new Date());//���뵱ǰʱ��
		Picture = picture;
		Other = other;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public ArrayList<Post> getPosts(){
		return Posts;
	}
	public void setPosts(Post post){
		this.Posts.add(post);
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getPersonal() {
		return Personal;
	}
	public void setPersonal(String personal) {
		Personal = personal;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
	public String getOther() {
		return Other;
	}
	public void setOther(String other) {
		Other = other;
	}
}
