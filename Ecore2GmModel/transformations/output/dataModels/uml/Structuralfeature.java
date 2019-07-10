/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Structuralfeature of the Data Model uml.
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
{@link isReadOnly}, 

* It provides of then following operations (getters and setters)
{@link getIsReadOnly},
{@link setIsReadOnly},
 */

@Description("A StructuralFeature is a typed feature of a Classifier that specifies the structure of instances of the Classifier.<p>From package UML::Classification.</p>")
 
@Abstract 

public interface Structuralfeature extends GenericEntity, uml.Feature, uml.Typedelement, uml.Multiplicityelement {

	EntityType<Structuralfeature> T = EntityTypes.T(Structuralfeature.class);

	/* Constants for each property name. */
	java.lang.String isReadOnly = "isReadOnly";

	@Description("If isReadOnly is true, the StructuralFeature may not be written to after initialization.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsReadOnly();
	void setIsReadOnly(types.Boolean isReadOnly);
}
