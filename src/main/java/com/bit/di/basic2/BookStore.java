package com.bit.di.basic2;

import com.fasterxml.jackson.annotation.JacksonInject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class BookStore {    // Component 뒤에 이름을 지정안해주면 class 이름으로 인지 (단, 첫 글자는 소문자로 인식한다)
    @Autowired  // @Autowired : 스프링의 컨텍스트에서 관리되는 빈(Bean)들을 자동으로 주입하는 기능을 제공한다.
    @Qualifier(value = "qv2")   // @Qualifier : 의존성 주입시에 여러 개의 동일한 타입의 빈(Bean) 중에서 특정 빈을 선택할 때 사용
    private Book book;

    public BookStore() {
    }

    public BookStore(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    @Autowired
    @Qualifier(value = "qv3")
    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "book=" + book +
                '}';
    }
}
