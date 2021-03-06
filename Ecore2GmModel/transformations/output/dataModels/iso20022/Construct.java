/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Construct of the Data Model iso20022.
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
{@link memberType}, 

* It provides of then following operations (getters and setters)
{@link getMemberType},
{@link setMemberType},
 */

@Description("Abstract layer : Abstract meta class for representing a BusinessElement, a MessageElement or a MessageBuildingBlock.")
 
@Abstract 

public interface Construct extends GenericEntity, iso20022.RepositoryConcept, iso20022.MultiplicityEntity {

	EntityType<Construct> T = EntityTypes.T(Construct.class);

	/* Constants for each property name. */
	java.lang.String memberType = "memberType";

	@Description("The type of this Member")
	@Mandatory
	iso20022.RepositoryType getMemberType();
	void setMemberType(iso20022.RepositoryType memberType);
}
