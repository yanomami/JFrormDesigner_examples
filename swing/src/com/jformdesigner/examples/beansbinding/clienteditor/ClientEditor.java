/*
 * Copyright (c) 2010, Oracle.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  * Neither the name of Oracle nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.jformdesigner.examples.beansbinding.clienteditor;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;

/**
 * Form that allows editing of information about one client.
 * <p>
 * Use the {@link #main} method to test this example.
 *
 * @author Jiri Vagner, Jan Stola
 */
public class ClientEditor extends JPanel {
    private Client client = Client.createTestClient();

    public ClientEditor() {
        initComponents();
        bindingGroup.addBindingListener(new LoggingBindingListener(validationMsgLabel));
    }

    /**
     * Returns {@code Client} being edited.
     *
     * @return {@code Client} being edited.
     */
    public Client getClient() {
        return client;
    }

    /**
     * Sets client to edit.
     *
     * @param client client to edit.
     */
    public void setClient(Client client) {
        Client oldClient = this.client;
        this.client = client;
        firePropertyChange("client", oldClient, client);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		clientInfoPane = new JTabbedPane();
		personalPanel = new JPanel();
		firstNameLabel = new JLabel();
		firstNameTextField = new JTextField();
		surnameLabel = new JLabel();
		surnameTextField = new JTextField();
		maritalComboBox = new JComboBox<>();
		sexLabel = new JLabel();
		maritalStatusLabel = new JLabel();
		maleRadioButton = new JRadioButton();
		femaleRadioButton = new JRadioButton();
		ageLabel = new JLabel();
		ageTextField = new JTextField();
		contactPanel = new JPanel();
		nicknameLabel = new JLabel();
		emailLabel = new JLabel();
		webLabel = new JLabel();
		imLabel = new JLabel();
		nicknameTextField = new JTextField();
		emailTextField = new JTextField();
		webTextField = new JTextField();
		imTextField = new JTextField();
		usernameLabel = new JLabel();
		clientInfoLabel = new JLabel();
		validationMsgLabel = new JLabel();
		ageConverter = new AgeConverter();
		ageValidator = new AgeValidator();
		maritalStatusConverter = new MaritalStatusConverter();
		requiredStringValidator = new RequiredStringValidator();
		emailValidator = new EmailValidator();

		//======== this ========

		//======== clientInfoPane ========
		{

			//======== personalPanel ========
			{
				personalPanel.setBorder(new EtchedBorder());

				//---- firstNameLabel ----
				firstNameLabel.setText("First Name:");

				//---- surnameLabel ----
				surnameLabel.setText("Surname:");

				//---- maritalComboBox ----
				maritalComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
					"Single",
					"Married",
					"Separated",
					"Divorced"
				}));

				//---- sexLabel ----
				sexLabel.setText("Sex:");

				//---- maritalStatusLabel ----
				maritalStatusLabel.setText("Marital status:");

				//---- maleRadioButton ----
				maleRadioButton.setText("male");

				//---- femaleRadioButton ----
				femaleRadioButton.setText("female");

				//---- ageLabel ----
				ageLabel.setText("Age:");

				GroupLayout personalPanelLayout = new GroupLayout(personalPanel);
				personalPanel.setLayout(personalPanelLayout);
				personalPanelLayout.setHorizontalGroup(
					personalPanelLayout.createParallelGroup()
						.addGroup(personalPanelLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(personalPanelLayout.createParallelGroup()
								.addComponent(sexLabel)
								.addGroup(personalPanelLayout.createSequentialGroup()
									.addGroup(personalPanelLayout.createParallelGroup()
										.addComponent(firstNameLabel)
										.addComponent(surnameLabel)
										.addComponent(maritalStatusLabel)
										.addComponent(ageLabel))
									.addGap(7, 7, 7)
									.addGroup(personalPanelLayout.createParallelGroup()
										.addGroup(personalPanelLayout.createSequentialGroup()
											.addComponent(maleRadioButton)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(femaleRadioButton))
										.addComponent(firstNameTextField, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
										.addComponent(surnameTextField, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
										.addGroup(personalPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
											.addComponent(ageTextField, GroupLayout.Alignment.LEADING)
											.addComponent(maritalComboBox, GroupLayout.Alignment.LEADING)))))
							.addContainerGap())
				);
				personalPanelLayout.setVerticalGroup(
					personalPanelLayout.createParallelGroup()
						.addGroup(personalPanelLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(personalPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(firstNameLabel)
								.addComponent(firstNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(personalPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(surnameLabel)
								.addComponent(surnameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(personalPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(maritalStatusLabel)
								.addComponent(maritalComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(personalPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(ageLabel)
								.addComponent(ageTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(personalPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(sexLabel)
								.addComponent(femaleRadioButton)
								.addComponent(maleRadioButton))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
			}
			clientInfoPane.addTab("Personal", personalPanel);

			//======== contactPanel ========
			{
				contactPanel.setBorder(new EtchedBorder());

				//---- nicknameLabel ----
				nicknameLabel.setText("Nickname:");

				//---- emailLabel ----
				emailLabel.setText("E-mail:");

				//---- webLabel ----
				webLabel.setText("Web:");

				//---- imLabel ----
				imLabel.setText("IM:");

				GroupLayout contactPanelLayout = new GroupLayout(contactPanel);
				contactPanel.setLayout(contactPanelLayout);
				contactPanelLayout.setHorizontalGroup(
					contactPanelLayout.createParallelGroup()
						.addGroup(contactPanelLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(contactPanelLayout.createParallelGroup()
								.addComponent(nicknameLabel)
								.addComponent(emailLabel)
								.addComponent(webLabel)
								.addComponent(imLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(contactPanelLayout.createParallelGroup()
								.addComponent(nicknameTextField, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
								.addComponent(emailTextField, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
								.addComponent(webTextField, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
								.addComponent(imTextField, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
							.addContainerGap())
				);
				contactPanelLayout.setVerticalGroup(
					contactPanelLayout.createParallelGroup()
						.addGroup(contactPanelLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(contactPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(nicknameLabel)
								.addComponent(nicknameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(contactPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(emailLabel)
								.addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(contactPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(webLabel)
								.addComponent(webTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(contactPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(imLabel)
								.addComponent(imTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(34, Short.MAX_VALUE))
				);
			}
			clientInfoPane.addTab("Contact", contactPanel);
		}

		//---- usernameLabel ----
		usernameLabel.setFont(new Font("Dialog", Font.BOLD, 24));

		//---- clientInfoLabel ----
		clientInfoLabel.setFont(new Font("Dialog", Font.PLAIN, 24));
		clientInfoLabel.setText("Client Info:");

		//---- validationMsgLabel ----
		validationMsgLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		validationMsgLabel.setForeground(Color.red);

		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(clientInfoPane, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
						.addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
							.addComponent(clientInfoLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(usernameLabel, GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
						.addComponent(validationMsgLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
					.addContainerGap())
		);
		layout.setVerticalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(clientInfoLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(usernameLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(clientInfoPane)
					.addGap(5, 5, 5)
					.addComponent(validationMsgLabel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);

		//---- sexButtonGroup ----
		ButtonGroup sexButtonGroup = new ButtonGroup();
		sexButtonGroup.add(maleRadioButton);
		sexButtonGroup.add(femaleRadioButton);

		//---- bindings ----
		bindingGroup = new BindingGroup();
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			this, ELProperty.create("${client.firstName}"),
			firstNameTextField, BeanProperty.create("text"), "firstName"));
		{
			Binding binding = Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
				this, ELProperty.create("${client.surname}"),
				surnameTextField, BeanProperty.create("text"), "surname");
			binding.setValidator(requiredStringValidator);
			bindingGroup.addBinding(binding);
		}
		{
			Binding binding = Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
				this, ELProperty.create("${client.maritalStatus}"),
				maritalComboBox, BeanProperty.create("selectedItem"), "maritalStatus");
			binding.setConverter(maritalStatusConverter);
			bindingGroup.addBinding(binding);
		}
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			this, ELProperty.create("${client.sex}"),
			maleRadioButton, BeanProperty.create("selected"), "sex"));
		{
			Binding binding = Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
				this, ELProperty.create("${client.age}"),
				ageTextField, BeanProperty.create("text"), "age");
			binding.setConverter(ageConverter);
			binding.setValidator(ageValidator);
			bindingGroup.addBinding(binding);
		}
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			this, ELProperty.create("${client.nickname}"),
			nicknameTextField, BeanProperty.create("text"), "nickname"));
		{
			Binding binding = Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
				this, ELProperty.create("${client.email}"),
				emailTextField, BeanProperty.create("text"), "email");
			binding.setValidator(emailValidator);
			bindingGroup.addBinding(binding);
		}
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			this, ELProperty.create("${client.web}"),
			webTextField, BeanProperty.create("text"), "web"));
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			this, ELProperty.create("${client.im}"),
			imTextField, BeanProperty.create("text"), "im"));
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			this, ELProperty.create("${client.firstName} ${client.surname}"),
			usernameLabel, BeanProperty.create("text"), "displayNameTitle"));
		bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        EventQueue.invokeLater(() -> {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception ex) {
				// ignore
			}

		    JFrame frame = new JFrame("Client Editor");
		    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		    frame.getContentPane().add(new ClientEditor());
		    frame.pack();
		    frame.setVisible(true);
		});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
	private JTabbedPane clientInfoPane;
	private JPanel personalPanel;
	private JLabel firstNameLabel;
	private JTextField firstNameTextField;
	private JLabel surnameLabel;
	private JTextField surnameTextField;
	private JComboBox<String> maritalComboBox;
	private JLabel sexLabel;
	private JLabel maritalStatusLabel;
	private JRadioButton maleRadioButton;
	private JRadioButton femaleRadioButton;
	private JLabel ageLabel;
	private JTextField ageTextField;
	private JPanel contactPanel;
	private JLabel nicknameLabel;
	private JLabel emailLabel;
	private JLabel webLabel;
	private JLabel imLabel;
	private JTextField nicknameTextField;
	private JTextField emailTextField;
	private JTextField webTextField;
	private JTextField imTextField;
	private JLabel usernameLabel;
	private JLabel clientInfoLabel;
	private JLabel validationMsgLabel;
	private AgeConverter ageConverter;
	private AgeValidator ageValidator;
	private MaritalStatusConverter maritalStatusConverter;
	private RequiredStringValidator requiredStringValidator;
	private EmailValidator emailValidator;
	private BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
