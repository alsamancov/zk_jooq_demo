package com.example.research.controller;


import com.example.research.service.CustomerService;
import com.example.research.service.CustomerServiceImpl;
import org.jooq.sources.tables.pojos.Customers;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.*;
import org.zkoss.zul.ext.Selectable;

import java.util.List;
import java.util.Set;

public class SearchController extends SelectorComposer<Component> {
    private static final long serialVersionUID = 1L;


    @Wire
    private Textbox keywordBox;

    @Wire
    private Listbox customersListbox;

    @Wire
    private Label uuidLabel;

    @Wire
    private Label firstnameLabel;

    @Wire
    private Label surnameLabel;

    @Wire
    private Label ageLabel;

    @Wire
    private Component detailBox;

    private CustomerService customerService = new CustomerServiceImpl();


   @Listen("onClick = #searchButton")
   public void search(){
       String keyword = keywordBox.getValue();
       List<Customers> result = customerService.search(keyword);
       customersListbox.setModel(new ListModelList<Customers>(result));
   }

   @Listen("onSelect = #customersListbox")
    public void showDetail(){
       detailBox.setVisible(true);

       Set<Customers> selection = ((Selectable<Customers>)customersListbox.getModel()).getSelection();
       if(selection != null && !selection.isEmpty()){
           Customers selected = selection.iterator().next();
           uuidLabel.setValue(selected.getCustomerId().toString());
           firstnameLabel.setValue(selected.getFirstname());
           surnameLabel.setValue(selected.getSurname());
           ageLabel.setValue(selected.getAge().toString());
       }
   }


}
