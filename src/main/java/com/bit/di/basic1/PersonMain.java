package com.bit.di.basic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PersonMain {
    public static void main(String[] args) {
//        // 해당 경로(person.xml)의 XML 설정 파일을 읽어와 애플리케이션 컨텍스트를 구성한다.
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:person.xml");

//        // getBean(String) : person.xml의
//		Person person1 = (Person) applicationContext.getBean("person1");	// singleton
//		Person person2 = (Person) applicationContext.getBean("person2");	// prototype
//
//		System.out.println(person1);
//		System.out.println(person2);
//
//
//		person1.setName("김민준");
//		System.out.println(person1.getName());
//
//		person2.setName("오경민");
//		System.out.println(person2.getName());
//
//		// person1은 singleton이기 때문에 setName()으로 값 변경이 가능하다.
//		// person2는 prototype이기 때문에 setName()으로 값을 변경해도 변경되지 않는다.
//		((Person)applicationContext.getBean("person1")).setName("민준");
//		((Person)applicationContext.getBean("person2")).setName("재홍");
//		System.out.println(((Person)applicationContext.getBean("person1")).getName());
//		System.out.println(((Person)applicationContext.getBean("person2")).getName());

//		================================================================================================================

//		Person person3 = (Person) applicationContext.getBean("person3");
//
//		System.out.println(person3);

		Person person4 = (Person) applicationContext.getBean("person4");
		System.out.println(person4);

        System.out.println(((PersonCollection)applicationContext.getBean("pc1")).getList());



        PersonCollection pc = (PersonCollection) applicationContext.getBean("pc1");

//        // List 출력
//        List<Person> list = pc.getList();
//
//        for (Person p : list ) {
//            System.out.println(p);
//        }

//        // Set 출력
//        Set<Person> set = pc.getSet();
//
//        for (Person p : set) {
//            System.out.println(p);
//        }






//        // Properties 출력
//        Properties prop = pc.getProperties();
//
//        // 방법 1
//        Set<String> keys = prop.stringPropertyNames();
//
//        for (String key : keys) {
//            String value = prop.getProperty(key);
//            System.out.println("Key: " + key + ", Value: " + value);
//        }

//        // 방법 2
//        Iterator iter = pc.getProperties().entrySet().iterator();
//        System.out.println(pc.getProperties());

//        // 방법 3
//        Properties props = pc.getProperties();
//
//        Iterator<Map.Entry<Object, Object>> iter = props.entrySet().iterator();
//
//        while (iter.hasNext()) {
//            Map.Entry<Object, Object> entry = iter.next();
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }







//        Map<Integer, Person> map = pc.getMap();
//
//        // 방법1 : keySet() 메서드로 키를 가져오고 get() 메서드로 값을 가져오는 방법
//        for (int key : map.keySet()) {
//            Person value = map.get(key);
//            System.out.println("Key: " + key + ", Value: " + value);
//        }
//
//        // 방법2 : entrySet() 메서드를 사용하여 키와 값의 쌍을 가져오는 방법
//        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
//            int key = entry.getKey();
//            Person value = entry.getValue();
//
//            System.out.println("Key: " + key + ", Value: " + value);
//        }
//
//        // 방법3 : 람다식을 사용하는 방법
//        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

//        // 방법4 : Iterator 사용
//        Iterator<Integer> i = map.keySet().iterator();
//        for (;i.hasNext();) {
//            Integer j = i.next();
//            System.out.println("Key: " + j + ", Value: " + map.get(j));
//        }

    }
}
