
public class Array<E> {
	private E[] data;
	private int size;
	
	//构造函数
	public Array(int capacity) {
		data = (E[])new Object[capacity];
		size = 0;
	}
	//无参数的构造函数
	public Array() {
		this(10);
	}
	//获取数组的容量
	public int getCapacity() {
		return data.length;
	}
	//获取数组中的元素个数
	public int getSize() {
		return size;
	}
	//返回数组是否为空
	public boolean isEmpty() {
		return size == 0;
	}
	//在index索引的位置插入一个新的元素
	public void add(int index,E e) {
		if(size == data.length)
			throw new IllegalArgumentException("Add failed");
		if(index < 0 || index >size)
			throw new IllegalArgumentException("Add failed");
		for(int i =size - 1;i >= index;i--)
			data[index] = e;
		size++;
	}
	//在所有元素后添加一个新元素
	public void addLast(E e) {
		add(size,e);
	}
	
}
