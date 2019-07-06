/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BusinessElement of the Data Model iso20022.
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
{@link isDerived}, 
{@link derivation}, 
{@link businessElementType}, 
{@link elementContext}, 

* It provides of then following operations (getters and setters)
{@link getIsDerived},
{@link getDerivation},
{@link getBusinessElementType},
{@link getElementContext},
{@link setIsDerived},
{@link setDerivation},
{@link setBusinessElementType},
{@link setElementContext},
 */

@Description("Property of a BusinessComponent that has a distinctive meaning within the scope of that BusinessComponent.")
 
@Abstract 

public interface BusinessElement extends GenericEntity, iso20022.Construct, iso20022.BusinessConcept {

	EntityType<BusinessElement> T = EntityTypes.T(BusinessElement.class);

	/* Constants for each property name. */
	java.lang.String isDerived = "isDerived";
	java.lang.String derivation = "derivation";
	java.lang.String businessElementType = "businessElementType";
	java.lang.String elementContext = "elementContext";

	@Description("Specifies whether a BusinessElement can be computed using other BusinessElements, but that is shown for clarity even though it adds no semantic information.")
	@Mandatory
	java.lang.Boolean getIsDerived();
	void setIsDerived(java.lang.Boolean isDerived);
	@Description("All of the MessageElements that derive from one BusinessElement in a specific BusinessComponent.")
	
	java.util.List<iso20022.MessageElement> getDerivation();
	void setDerivation(java.util.List<iso20022.MessageElement> derivation);

	@Description("Derived direct reference to the type of the BusinessElement.")
	@Mandatory
	iso20022.BusinessElementType getBusinessElementType();
	void setBusinessElementType(iso20022.BusinessElementType businessElementType);
	@Description("The business context in which the BusinessElement is used")
	@Mandatory
	iso20022.BusinessComponent getElementContext();
	void setElementContext(iso20022.BusinessComponent elementContext);
}
