/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRepresentationContext of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link ContextIdentifier}, 
{@link ContextType}, 
{@link RepresentationsInContext}, 

* It provides of then following operations (getters and setters)
{@link getContextIdentifier},
{@link getContextType},
{@link getRepresentationsInContext},
{@link setContextIdentifier},
{@link setContextType},
{@link setRepresentationsInContext},
 */

@Description("")

public interface IfcRepresentationContext extends GenericEntity {

	EntityType<IfcRepresentationContext> T = EntityTypes.T(IfcRepresentationContext.class);

	/* Constants for each property name. */
	java.lang.String ContextIdentifier = "ContextIdentifier";
	java.lang.String ContextType = "ContextType";
	java.lang.String RepresentationsInContext = "RepresentationsInContext";

	@Description("")
	@Mandatory
	java.lang.String getContextIdentifier();
	void setContextIdentifier(java.lang.String ContextIdentifier);
	@Description("")
	@Mandatory
	java.lang.String getContextType();
	void setContextType(java.lang.String ContextType);
	@Description("")
	
	java.util.List<ifc4.IfcRepresentation> getRepresentationsInContext();
	void setRepresentationsInContext(java.util.List<ifc4.IfcRepresentation> RepresentationsInContext);

}
