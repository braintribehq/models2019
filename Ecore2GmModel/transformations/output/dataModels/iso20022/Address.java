/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Address of the Data Model iso20022.
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
{@link broadCastList}, 
{@link endpoint}, 

* It provides of then following operations (getters and setters)
{@link getBroadCastList},
{@link getEndpoint},
{@link setBroadCastList},
{@link setEndpoint},
 */

@Description("identification and efficient resolution to the location of a MessagingEndpoint")

public interface Address extends GenericEntity, iso20022.ModelEntity {

	EntityType<Address> T = EntityTypes.T(Address.class);

	/* Constants for each property name. */
	java.lang.String broadCastList = "broadCastList";
	java.lang.String endpoint = "endpoint";

	@Description("a BroadCastList to which this Address belongs")
	
	java.util.List<iso20022.BroadcastList> getBroadCastList();
	void setBroadCastList(java.util.List<iso20022.BroadcastList> broadCastList);

	@Description("specifies the MessagingEndpoint for the Address")
	@Mandatory
	iso20022.MessagingEndpoint getEndpoint();
	void setEndpoint(iso20022.MessagingEndpoint endpoint);
}
