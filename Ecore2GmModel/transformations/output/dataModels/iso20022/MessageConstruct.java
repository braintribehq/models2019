/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageConstruct of the Data Model iso20022.
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
{@link xmlTag}, 
{@link xmlMemberType}, 

* It provides of then following operations (getters and setters)
{@link getXmlTag},
{@link getXmlMemberType},
{@link setXmlTag},
{@link setXmlMemberType},
 */

@Description("Abstract layer : Abstract meta class for representing a MessageElement or a MessageBuildingBlock")
 
@Abstract 

public interface MessageConstruct extends GenericEntity, iso20022.Construct {

	EntityType<MessageConstruct> T = EntityTypes.T(MessageConstruct.class);

	/* Constants for each property name. */
	java.lang.String xmlTag = "xmlTag";
	java.lang.String xmlMemberType = "xmlMemberType";

	@Description("XML schema tag name for the element.")
	@Mandatory
	java.lang.String getXmlTag();
	void setXmlTag(java.lang.String xmlTag);
	@Description("Direct reference to the type of a MessageElement or MessageBuildingBlock")
	@Mandatory
	iso20022.LogicalType getXmlMemberType();
	void setXmlMemberType(iso20022.LogicalType xmlMemberType);
}
