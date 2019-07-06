/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageComponentType of the Data Model iso20022.
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
{@link messageBuildingBlock}, 
{@link isTechnical}, 
{@link trace}, 

* It provides of then following operations (getters and setters)
{@link getMessageBuildingBlock},
{@link getIsTechnical},
{@link getTrace},
{@link setMessageBuildingBlock},
{@link setIsTechnical},
{@link setTrace},
 */

@Description("MessageComponent, ExternalSchema, UserDefined or ChoiceComponent")
 
@Abstract 

public interface MessageComponentType extends GenericEntity, iso20022.TopLevelDictionaryEntry, iso20022.LogicalType, iso20022.MessageConcept {

	EntityType<MessageComponentType> T = EntityTypes.T(MessageComponentType.class);

	/* Constants for each property name. */
	java.lang.String messageBuildingBlock = "messageBuildingBlock";
	java.lang.String isTechnical = "isTechnical";
	java.lang.String trace = "trace";

	@Description("The MessageBuildingBlock that is the context for this MessageComponentType")
	
	java.util.List<iso20022.MessageBuildingBlock> getMessageBuildingBlock();
	void setMessageBuildingBlock(java.util.List<iso20022.MessageBuildingBlock> messageBuildingBlock);

	@Description("A property indicating the absense of a semantic relationship to a BusinessComponent, i.e. it is not derived from a BusinessComponent")
	@Mandatory
	java.lang.Boolean getIsTechnical();
	void setIsTechnical(java.lang.Boolean isTechnical);
	@Description("The BusinessComponent that this MessageComponentType is derived from.")
	@Mandatory
	iso20022.BusinessComponent getTrace();
	void setTrace(iso20022.BusinessComponent trace);
}
