
public class Array<E> {
	private E[] data;
	private int size;
	
	//���캯��
	public Array(int capacity) {
		data = (E[])new Object[capacity];
		size = 0;
	}
	//�޲����Ĺ��캯��
	public Array() {
		this(10);
	}
	//��ȡ���������
	public int getCapacity() {
		return data.length;
	}
	//��ȡ�����е�Ԫ�ظ���
	public int getSize() {
		return size;
	}
	//���������Ƿ�Ϊ��
	public boolean isEmpty() {
		return size == 0;
	}
	//��index������λ�ò���һ���µ�Ԫ��
	public void add(int index,E e) {
		if(size == data.length)
			throw new IllegalArgumentException("Add failed");
		if(index < 0 || index >size)
			throw new IllegalArgumentException("Add failed");
		for(int i =size - 1;i >= index;i--)
			data[index] = e;
		size++;
	}
	//������Ԫ�غ����һ����Ԫ��
	public void addLast(E e) {
		add(size,e);
	}
	
}
