package di.setter.basic;

public class InsaImpl implements Insa {
	MemberDAO dao;
	
	
	public InsaImpl() {
		System.out.println("�⺻������");
	}

	//Constructor Injection���� MemberDAO��ü�� ���Թޱ� ���� �ʿ�
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl �Ű�����1�� ������");
	}
	
	//setter Injection���� MemberDAO��ü�� ���Թޱ� ���� setter�޼ҵ带 �غ�
	public void setDao(MemberDAO dao) {
		System.out.println("setter�޼ҵ� ȣ��");
		this.dao = dao;
	}
	
	public MemberDAO getDao() {
		return dao;
	}

	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
