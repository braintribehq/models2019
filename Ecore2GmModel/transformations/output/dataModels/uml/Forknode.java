/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Forknode of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

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

@Description("A ForkNode is a ControlNode that splits a flow into multiple concurrent flows.<p>From package UML::Activities.</p>")

public interface Forknode extends GenericEntity, uml.Controlnode {

	EntityType<Forknode> T = EntityTypes.T(Forknode.class);

	/* Constants for each property name. */

}
