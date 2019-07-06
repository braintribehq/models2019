/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageAssociationEnd of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link isComposite}, 
{@link type}, 

* It provides of then following operations (getters and setters)
{@link getIsComposite},
{@link getType},
{@link setIsComposite},
{@link setType},
 */

@Description("Kind of MessageElement that relates two MessageComponentTypes.")

public interface MessageAssociationEnd extends GenericEntity, iso20022.MessageElement {

	EntityType<MessageAssociationEnd> T = EntityTypes.T(MessageAssociationEnd.class);

	/* Constants for each property name. */
	java.lang.String isComposite = "isComposite";
	java.lang.String type = "type";

	@Description("Indicates if the message element is a composite.")
	@Mandatory
	java.lang.Boolean getIsComposite();
	void setIsComposite(java.lang.Boolean isComposite);
	@Description("The MessageComponentType which specifies the complex content model of a MessageAssociationEnd.")
	@Mandatory
	iso20022.MessageComponentType getType();
	void setType(iso20022.MessageComponentType type);
}
