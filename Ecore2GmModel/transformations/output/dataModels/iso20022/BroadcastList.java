/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BroadcastList of the Data Model iso20022.
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
{@link address}, 

* It provides of then following operations (getters and setters)
{@link getAddress},
{@link setAddress},
 */

@Description("set of references to MessagingEndpoints (identified by their Address), that is used for message broadcasting")

public interface BroadcastList extends GenericEntity, iso20022.ModelEntity {

	EntityType<BroadcastList> T = EntityTypes.T(BroadcastList.class);

	/* Constants for each property name. */
	java.lang.String address = "address";

	@Description("a BroadCastList entry using an Address")
	
	java.util.List<iso20022.Address> getAddress();
	void setAddress(java.util.List<iso20022.Address> address);

}
