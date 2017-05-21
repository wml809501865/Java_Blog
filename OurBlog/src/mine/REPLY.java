package mine;

public class REPLY {
		 String name; //�ظ���
		 String reply; //�ظ�����
		 String date; //�ظ�����
		 String title;//����������Ŀ
		 int floor;//����¥��
		public REPLY() {
			super();
			// TODO Auto-generated constructor stub
		}
		public REPLY(String reply1,String name,String title,int floor,String date) {//�½�һ���ظ�
			this.date=date;
			this.name=name;
			this.floor=floor;
			this.title=title;
			this.setReply(reply1);
			// TODO Auto-generated constructor stub
		}
		public String getname() {  //��ȡ�ظ�����
			return name;
		}
		public void setname(String name) {  //��ȡ�ظ�����
			this.name=name;
		}
		public String getReply() {
			return reply;
		}
		public void setReply(String reply1) { //���Ļظ�
			reply=reply1;
		}
		public String getDate() {
			return date;
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
		public void setDate(String date) {
			
			this.date = date;
		}
	}

