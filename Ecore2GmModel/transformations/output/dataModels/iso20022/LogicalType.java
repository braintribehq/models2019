/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type LogicalType of the Data Model iso20022.
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

* It provides of then following operations (getters and setters)
 */

@Description("Abstract layer : Abstract meta class for representing the type of a MessageBuildingBlock or MessageElement, that is : a DataType, MessageComponent, ChoiceComponent or ExternalSchema or UserDefined")
 
@Abstract 

public interface LogicalType extends GenericEntity, iso20022.RepositoryType {

	EntityType<LogicalType> T = EntityTypes.T(LogicalType.class);

	/* Constants for each property name. */

}
