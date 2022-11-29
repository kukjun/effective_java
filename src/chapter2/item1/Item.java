package chapter2.item1;

import java.sql.Date;

public class Item {
    private int value;
    private String key;

    private Item() {

    }

    // 정적 팩토리 메서드

    /**
     * 새로운 인스턴스 생성
     */
    public static Item newInstance(String key, int value) {
        item = new Item();
        item.key = key;
        item.value = value;
        return item;
    }

    /**
     * 기존 인스턴스 조회
     */
    public static Item getInstance() {
        if (item != null) {
            return item;
        } else {
            return newInstance("default", 0);
        }
    }

    /**
     * 매개변수 받아 형 변환
     */
    public static Item from(String key) {
        Item item = new Item();
        item.key = key;
        item.value = 0;
        return item;
    }

    /**
     * 다른 클래스 팩터리 메서드 사용
     */
    public static String getString(Item item){
        // 이와 유사하게 사용
        return item.key;
    }



    public static Item item;


}
