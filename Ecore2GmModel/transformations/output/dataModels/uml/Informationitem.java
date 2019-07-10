/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Informationitem of the Data Model uml.
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
{@link represented}, 

* It provides of then following operations (getters and setters)
{@link getRepresented},
{@link setRepresented},
 */

@Description("InformationItems represent many kinds of information that can flow from sources to targets in very abstract ways.? They represent the kinds of information that may move within a system, but do not elaborate details of the transferred information.? Details of transferred information are the province of other Classifiers that may ultimately define InformationItems.? Consequently, InformationItems cannot be instantiated and do not themselves have features, generalizations, or associations.?An important use of InformationItems is to represent information during early design stages, possibly before the detailed modeling decisions that will ultimately define them have been made. Another purpose of InformationItems is to abstract portions of complex models in less precise, but perhaps more general and communicable, ways.<p>From package UML::InformationFlows.</p>")

public interface Informationitem extends GenericEntity, uml.Classifier {

	EntityType<Informationitem> T = EntityTypes.T(Informationitem.class);

	/* Constants for each property name. */
	java.lang.String represented = "represented";

	@Description("Determines the classifiers that will specify the structure and nature of the information. An information item represents all its represented classifiers.<p>From package UML::InformationFlows.</p>")
	
	java.util.List<uml.Classifier> getRepresented();
	void setRepresented(java.util.List<uml.Classifier> represented);

}
