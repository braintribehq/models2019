/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageElement of the Data Model iso20022.
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
{@link isTechnical}, 
{@link businessComponentTrace}, 
{@link businessElementTrace}, 
{@link componentContext}, 
{@link isDerived}, 

* It provides of then following operations (getters and setters)
{@link getIsTechnical},
{@link getBusinessComponentTrace},
{@link getBusinessElementTrace},
{@link getComponentContext},
{@link getIsDerived},
{@link setIsTechnical},
{@link setBusinessComponentTrace},
{@link setBusinessElementTrace},
{@link setComponentContext},
{@link setIsDerived},
 */

@Description("Characteristic of a MessageComponent / ChoiceComponent, having a unique meaning within the scope of that MessageComponent / ChoiceComponent")
 
@Abstract 

public interface MessageElement extends GenericEntity, iso20022.MessageConstruct, iso20022.MessageConcept {

	EntityType<MessageElement> T = EntityTypes.T(MessageElement.class);

	/* Constants for each property name. */
	java.lang.String isTechnical = "isTechnical";
	java.lang.String businessComponentTrace = "businessComponentTrace";
	java.lang.String businessElementTrace = "businessElementTrace";
	java.lang.String componentContext = "componentContext";
	java.lang.String isDerived = "isDerived";

	@Description("a property of a MessageElement indicating whether it has a semantic relationship to a BusinessComponent / BusinessElement, i.e. whether it is derived from a BusinessComponent  /  BusinessElement")
	@Mandatory
	java.lang.Boolean getIsTechnical();
	void setIsTechnical(java.lang.Boolean isTechnical);
	@Description("the trace of a MessageElement to the BusinessComponent from which it is derived")
	@Mandatory
	iso20022.BusinessComponent getBusinessComponentTrace();
	void setBusinessComponentTrace(iso20022.BusinessComponent businessComponentTrace);
	@Description("The trace of a MessageElement to the BusinessElement from which the MessageElement is derived")
	@Mandatory
	iso20022.BusinessElement getBusinessElementTrace();
	void setBusinessElementTrace(iso20022.BusinessElement businessElementTrace);
	@Description("the MessageComponent that describes the context within which the MessageElement is defined")
	@Mandatory
	iso20022.MessageElementContainer getComponentContext();
	void setComponentContext(iso20022.MessageElementContainer componentContext);
	@Description("a Property of a MessageElement specifying whether a MessageElement can be computed using other MessageElements, but that is shown for clarity even though it adds no semantic information")
	@Mandatory
	java.lang.Boolean getIsDerived();
	void setIsDerived(java.lang.Boolean isDerived);
}
