/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageInstance of the Data Model iso20022.
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
{@link specification}, 
{@link transportMessage}, 

* It provides of then following operations (getters and setters)
{@link getSpecification},
{@link getTransportMessage},
{@link setSpecification},
{@link setTransportMessage},
 */

@Description("instance of MessageDefinition, containing a set of structured information exchanged between BusinessRoles, in the scope of a BusinessTransaction")

public interface MessageInstance extends GenericEntity, iso20022.ModelEntity {

	EntityType<MessageInstance> T = EntityTypes.T(MessageInstance.class);

	/* Constants for each property name. */
	java.lang.String specification = "specification";
	java.lang.String transportMessage = "transportMessage";

	@Description("the SyntaxScheme instantiated by this MessageInstance")
	@Mandatory
	iso20022.SyntaxMessageScheme getSpecification();
	void setSpecification(iso20022.SyntaxMessageScheme specification);
	@Description("the TransportMessage that contains the MessageInstance")
	
	java.util.List<iso20022.TransportMessage> getTransportMessage();
	void setTransportMessage(java.util.List<iso20022.TransportMessage> transportMessage);

}
