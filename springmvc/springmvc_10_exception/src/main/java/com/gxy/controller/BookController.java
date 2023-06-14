package com.gxy.controller;

import com.gxy.domain.Book;
import com.gxy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.Save_OK : Code.Save_Error, flag);
    }
    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.Update_OK : Code.Update_Error, flag);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.Delete_OK : Code.Delete_Error, flag);
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        if(id == 1){
            int i = 1 / 0;
        }
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.Get_OK : Code.Get_Error;
        String msg = book != null ? "查询成功" : "查询失败，请重试";
        return new Result(code, book, msg);
    }
    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code = bookList != null ? Code.Get_OK : Code.Get_Error;
        String msg = bookList != null ? "查询成功" : "查询失败，请重试";
        return new Result(code, bookList, msg);
    }

}
