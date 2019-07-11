/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcApplication of the Data Model iai.
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
{@link ApplicationDeveloper}, 
{@link Version}, 
{@link ApplicationFullName}, 
{@link ApplicationIdentifier}, 

* It provides of then following operations (getters and setters)
{@link getApplicationDeveloper},
{@link getVersion},
{@link getApplicationFullName},
{@link getApplicationIdentifier},
{@link setApplicationDeveloper},
{@link setVersion},
{@link setApplicationFullName},
{@link setApplicationIdentifier},
 */

@Description("")

public interface IfcApplication extends GenericEntity {

	EntityType<IfcApplication> T = EntityTypes.T(IfcApplication.class);

	/* Constants for each property name. */
	java.lang.String ApplicationDeveloper = "ApplicationDeveloper";
	java.lang.String Version = "Version";
	java.lang.String ApplicationFullName = "ApplicationFullName";
	java.lang.String ApplicationIdentifier = "ApplicationIdentifier";

	@Description("")
	@Mandatory
	ifc4.IfcOrganization getApplicationDeveloper();
	void setApplicationDeveloper(ifc4.IfcOrganization ApplicationDeveloper);
	@Description("")
	@Mandatory
	java.lang.String getVersion();
	void setVersion(java.lang.String Version);
	@Description("")
	@Mandatory
	java.lang.String getApplicationFullName();
	void setApplicationFullName(java.lang.String ApplicationFullName);
	@Description("")
	@Mandatory
	java.lang.String getApplicationIdentifier();
	void setApplicationIdentifier(java.lang.String ApplicationIdentifier);
}
