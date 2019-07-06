/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BusinessAttribute of the Data Model iso20022.
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
{@link simpleType}, 
{@link complexType}, 

* It provides of then following operations (getters and setters)
{@link getSimpleType},
{@link getComplexType},
{@link setSimpleType},
{@link setComplexType},
 */

@Description("A BusinessElement, typed by a BusinessComponent or a DataType (contrary to a BusinessAssociationEnd, which is always typed by another BusinessComponent)")

public interface BusinessAttribute extends GenericEntity, iso20022.BusinessElement {

	EntityType<BusinessAttribute> T = EntityTypes.T(BusinessAttribute.class);

	/* Constants for each property name. */
	java.lang.String simpleType = "simpleType";
	java.lang.String complexType = "complexType";

	@Description("Expresses that the content model of a BusinessAttribute may be specified by a type from the XSD type library or a derived datatype.")
	@Mandatory
	iso20022.DataType getSimpleType();
	void setSimpleType(iso20022.DataType simpleType);
	@Description("The BusinessComponent that describes the complex content model of the BusinessAttrribute.")
	@Mandatory
	iso20022.BusinessComponent getComplexType();
	void setComplexType(iso20022.BusinessComponent complexType);
}
