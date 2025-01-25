package baitap2024.thi.view;

import baitap2024.thi.controller.ContactController;

import java.io.IOException;

public class View {
   public static void main(String[] args) throws IOException {
       ContactController contactController = new ContactController();
       contactController.Controls();
   }
}
