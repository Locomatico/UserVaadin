package com.example.gui;

import com.example.domain.User;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;

public class Formulario extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":true,"snappingDistance":10} */
	
	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private VerticalSplitPanel verticalSplitPanel_3;
	@AutoGenerated
	private TextArea textArea_1;
	@AutoGenerated
	private Panel panel_1;
	@AutoGenerated
	private VerticalLayout verticalLayout_1;
	@AutoGenerated
	private HorizontalSplitPanel horizontalSplitPanel_2;
	@AutoGenerated
	private TabSheet tabSheet_1;
	@AutoGenerated
	private GridLayout gridLayout_1;
	@AutoGenerated
	private Table Usuarios;
	@AutoGenerated
	private ListSelect listSelect_1;
	@AutoGenerated
	private MenuBar menuBar_2;
	@AutoGenerated
	private Label label_1;
	private JPAContainer<User> users= JPAContainerFactory.make(User.class, "User");
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public Formulario() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
		
		Usuarios.setSelectable(true);
		Usuarios.setContainerDataSource(users);
		
		Usuarios.setSizeFull();
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// verticalSplitPanel_3
		verticalSplitPanel_3 = buildVerticalSplitPanel_3();
		mainLayout.addComponent(verticalSplitPanel_3);
		
		return mainLayout;
	}

	@AutoGenerated
	private VerticalSplitPanel buildVerticalSplitPanel_3() {
		// common part: create layout
		verticalSplitPanel_3 = new VerticalSplitPanel();
		verticalSplitPanel_3.setImmediate(false);
		verticalSplitPanel_3.setWidth("100.0%");
		verticalSplitPanel_3.setHeight("100.0%");
		
		// panel_1
		panel_1 = buildPanel_1();
		verticalSplitPanel_3.addComponent(panel_1);
		
		// textArea_1
		textArea_1 = new TextArea();
		textArea_1.setImmediate(false);
		textArea_1.setWidth("100.0%");
		textArea_1.setHeight("100.0%");
		verticalSplitPanel_3.addComponent(textArea_1);
		
		return verticalSplitPanel_3;
	}

	@AutoGenerated
	private Panel buildPanel_1() {
		// common part: create layout
		panel_1 = new Panel();
		panel_1.setImmediate(false);
		panel_1.setDescription("Sistema de gestion de condominios");
		panel_1.setWidth("100.0%");
		panel_1.setHeight("100.0%");
		
		// verticalLayout_1
		verticalLayout_1 = buildVerticalLayout_1();
		panel_1.setContent(verticalLayout_1);
		
		return panel_1;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_1() {
		// common part: create layout
		verticalLayout_1 = new VerticalLayout();
		verticalLayout_1.setImmediate(false);
		verticalLayout_1.setWidth("100.0%");
		verticalLayout_1.setHeight("100.0%");
		verticalLayout_1.setMargin(false);
		
		// label_1
		label_1 = new Label();
		label_1.setImmediate(false);
		label_1.setWidth("-1px");
		label_1.setHeight("-1px");
		label_1.setValue("Sistema de Gestion de Condominios (SIGECO)");
		verticalLayout_1.addComponent(label_1);
		
		// menuBar_2
		menuBar_2 = new MenuBar();
		menuBar_2.setImmediate(false);
		menuBar_2.setWidth("100.0%");
		menuBar_2.setHeight("-1px");
		verticalLayout_1.addComponent(menuBar_2);
		
		// horizontalSplitPanel_2
		horizontalSplitPanel_2 = buildHorizontalSplitPanel_2();
		verticalLayout_1.addComponent(horizontalSplitPanel_2);
		verticalLayout_1.setExpandRatio(horizontalSplitPanel_2, 1.0f);
		
		return verticalLayout_1;
	}

	@AutoGenerated
	private HorizontalSplitPanel buildHorizontalSplitPanel_2() {
		// common part: create layout
		horizontalSplitPanel_2 = new HorizontalSplitPanel();
		horizontalSplitPanel_2.setImmediate(false);
		horizontalSplitPanel_2.setWidth("100.0%");
		horizontalSplitPanel_2.setHeight("100.0%");
		
		// listSelect_1
		listSelect_1 = new ListSelect();
		listSelect_1.setImmediate(false);
		listSelect_1.setWidth("100.0%");
		listSelect_1.setHeight("100.0%");
		horizontalSplitPanel_2.addComponent(listSelect_1);
		
		// tabSheet_1
		tabSheet_1 = buildTabSheet_1();
		horizontalSplitPanel_2.addComponent(tabSheet_1);
		
		return horizontalSplitPanel_2;
	}

	@AutoGenerated
	private TabSheet buildTabSheet_1() {
		// common part: create layout
		tabSheet_1 = new TabSheet();
		tabSheet_1.setImmediate(true);
		tabSheet_1.setWidth("100.0%");
		tabSheet_1.setHeight("100.0%");
		
		// Usuarios
		Usuarios = new Table();
		Usuarios.setImmediate(true);
		Usuarios.setWidth("100.0%");
		Usuarios.setHeight("100.0%");
		tabSheet_1.addTab(Usuarios, "Usuarios", null);
		
		// gridLayout_1
		gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setWidth("-1px");
		gridLayout_1.setHeight("-1px");
		gridLayout_1.setMargin(false);
		tabSheet_1.addTab(gridLayout_1, "Tab", null);
		
		return tabSheet_1;
	}

}