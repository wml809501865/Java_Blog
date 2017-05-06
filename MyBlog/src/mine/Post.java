package mine;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Post {
	public static final int PAGE_SIZE=3;
	 String Username;//������
	 String title;//��Ŀ
	 String text; //����
	 String date; //��������
	 int floor;//�ظ�¥����
	 String account;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(String Username,String title,String text1) {//�½�һ������
		this.Username=Username;
		this.title=title;
		this.text=text1;
		SimpleDateFormat datee =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.date = datee.format(new Date());//���뵱ǰʱ��
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getUserName() {
		return Username;
	}
	public void setUserName(String name) {
		this.Username = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {  //�޸���������
		this.text = text;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	/*public void setsmallReply(int floor,REPLY reply2) throws Exception{//����һ����ظ���Ļظ�
		if(reply2.getFloor()==floor)
		for(int i=0;i<reply.get(floor).length;i++){
			if(reply.get(floor)[i]==null){
				reply.get(floor)[i]=reply2;
				break;
			}
		}
		else
			throw new Exception("¥�㲻��Ӧ������!!!"); 
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;//���뵱ǰʱ��
	}
	*/
}
