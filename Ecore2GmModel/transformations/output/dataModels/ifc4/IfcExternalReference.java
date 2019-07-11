/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcExternalReference of the Data Model iai.
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
{@link Location}, 
{@link Identification}, 
{@link Name}, 
{@link ExternalReferenceForResources}, 

* It provides of then following operations (getters and setters)
{@link getLocation},
{@link getIdentification},
{@link getName},
{@link getExternalReferenceForResources},
{@link setLocation},
{@link setIdentification},
{@link setName},
{@link setExternalReferenceForResources},
 */

@Description("")

public interface IfcExternalReference extends GenericEntity, ifc4.IfcLightDistributionDataSourceSelect, ifc4.IfcObjectReferenceSelect, ifc4.IfcResourceObjectSelect {

	EntityType<IfcExternalReference> T = EntityTypes.T(IfcExternalReference.class);

	/* Constants for each property name. */
	java.lang.String Location = "Location";
	java.lang.String Identification = "Identification";
	java.lang.String Name = "Name";
	java.lang.String ExternalReferenceForResources = "ExternalReferenceForResources";

	@Description("")
	@Mandatory
	java.lang.String getLocation();
	void setLocation(java.lang.String Location);
	@Description("")
	@Mandatory
	java.lang.String getIdentification();
	void setIdentification(java.lang.String Identification);
	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	
	java.util.List<ifc4.IfcExternalReferenceRelationship> getExternalReferenceForResources();
	void setExternalReferenceForResources(java.util.List<ifc4.IfcExternalReferenceRelationship> ExternalReferenceForResources);

}
