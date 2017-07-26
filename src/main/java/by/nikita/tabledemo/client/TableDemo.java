package by.nikita.tabledemo.client;

import by.nikita.model.User;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;

import java.util.Collection;

/**
 * Created by niat0717 on 7/20/2017.
 */
public class TableDemo implements EntryPoint {
    private final UsersServiceAsync usersServiceAsync = GWT.create(UsersService.class);

    private Collection<User> users;

    private CellTable<User> cellTable;
    private Button clearButton;
    private Button getButton;
    private Button deleteButton;
    private Button getAllButton;
    private TextBox idField;

    public void onModuleLoad() {
        initComponents();

        // TODO: 7/20/2017
    }

    private void initComponents() {
        cellTable = new CellTable<User>();

    }

    private long getIdInput() {
        return Long.valueOf(idField.getText());
    }

    private class AddClickHandler implements ClickHandler {
        public void onClick(ClickEvent clickEvent) {

        }
    }
}
