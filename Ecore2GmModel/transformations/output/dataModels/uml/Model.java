/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Model of the Data Model uml.
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
{@link viewpoint}, 

* It provides of then following operations (getters and setters)
{@link getViewpoint},
{@link setViewpoint},
 */

@Description("A model captures a view of a physical system. It is an abstraction of the physical system, with a certain purpose. This purpose determines what is to be included in the model and what is irrelevant. Thus the model completely describes those aspects of the physical system that are relevant to the purpose of the model, at the appropriate level of detail.<p>From package UML::Packages.</p>")

public interface Model extends GenericEntity, uml.Package {

	EntityType<Model> T = EntityTypes.T(Model.class);

	/* Constants for each property name. */
	java.lang.String viewpoint = "viewpoint";

	@Description("The name of the viewpoint that is expressed by a model (this name may refer to a profile definition).<p>From package UML::Packages.</p>")
	@Mandatory
	types.String getViewpoint();
	void setViewpoint(types.String viewpoint);
}
