/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Directedrelationship of the Data Model uml.
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
{@link source}, 
{@link target}, 

* It provides of then following operations (getters and setters)
{@link getSource},
{@link getTarget},
{@link setSource},
{@link setTarget},
 */

@Description("A DirectedRelationship represents a relationship between a collection of source model Elements and a collection of target model Elements.<p>From package UML::CommonStructure.</p>")
 
@Abstract 

public interface Directedrelationship extends GenericEntity, uml.Relationship {

	EntityType<Directedrelationship> T = EntityTypes.T(Directedrelationship.class);

	/* Constants for each property name. */
	java.lang.String source = "source";
	java.lang.String target = "target";

	@Description("Specifies the source Element(s) of the DirectedRelationship.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Element> getSource();
	void setSource(java.util.List<uml.Element> source);

	@Description("Specifies the target Element(s) of the DirectedRelationship.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Element> getTarget();
	void setTarget(java.util.List<uml.Element> target);

}
