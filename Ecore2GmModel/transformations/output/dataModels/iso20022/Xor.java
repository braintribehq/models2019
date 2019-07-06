/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Xor of the Data Model iso20022.
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
{@link impactedElements}, 
{@link messageComponent}, 
{@link impactedMessageBuildingBlocks}, 
{@link messageDefinition}, 

* It provides of then following operations (getters and setters)
{@link getImpactedElements},
{@link getMessageComponent},
{@link getImpactedMessageBuildingBlocks},
{@link getMessageDefinition},
{@link setImpactedElements},
{@link setMessageComponent},
{@link setImpactedMessageBuildingBlocks},
{@link setMessageDefinition},
 */

@Description("A rule which enforces a choice amongst a set of Message Elements contained either within a Message Definition or a Message Component.")

public interface Xor extends GenericEntity, iso20022.RepositoryConcept {

	EntityType<Xor> T = EntityTypes.T(Xor.class);

	/* Constants for each property name. */
	java.lang.String impactedElements = "impactedElements";
	java.lang.String messageComponent = "messageComponent";
	java.lang.String impactedMessageBuildingBlocks = "impactedMessageBuildingBlocks";
	java.lang.String messageDefinition = "messageDefinition";

	@Description("Message Elements impacted by the XOR.")
	
	java.util.List<iso20022.MessageElement> getImpactedElements();
	void setImpactedElements(java.util.List<iso20022.MessageElement> impactedElements);

	@Description("Message Component owning the XOR.")
	@Mandatory
	iso20022.MessageComponent getMessageComponent();
	void setMessageComponent(iso20022.MessageComponent messageComponent);
	@Description("MessageBuildingBlocks impacted by the XOR.")
	
	java.util.List<iso20022.MessageBuildingBlock> getImpactedMessageBuildingBlocks();
	void setImpactedMessageBuildingBlocks(java.util.List<iso20022.MessageBuildingBlock> impactedMessageBuildingBlocks);

	@Description("Message Definition owning the XOR.")
	@Mandatory
	iso20022.MessageDefinition getMessageDefinition();
	void setMessageDefinition(iso20022.MessageDefinition messageDefinition);
}
