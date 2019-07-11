/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCoordinateReferenceSystem of the Data Model iai.
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
{@link Name}, 
{@link Description}, 
{@link GeodeticDatum}, 
{@link VerticalDatum}, 
{@link HasCoordinateOperation}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getDescription},
{@link getGeodeticDatum},
{@link getVerticalDatum},
{@link getHasCoordinateOperation},
{@link setName},
{@link setDescription},
{@link setGeodeticDatum},
{@link setVerticalDatum},
{@link setHasCoordinateOperation},
 */

@Description("")

public interface IfcCoordinateReferenceSystem extends GenericEntity, ifc4.IfcCoordinateReferenceSystemSelect {

	EntityType<IfcCoordinateReferenceSystem> T = EntityTypes.T(IfcCoordinateReferenceSystem.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String GeodeticDatum = "GeodeticDatum";
	java.lang.String VerticalDatum = "VerticalDatum";
	java.lang.String HasCoordinateOperation = "HasCoordinateOperation";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	java.lang.String getGeodeticDatum();
	void setGeodeticDatum(java.lang.String GeodeticDatum);
	@Description("")
	@Mandatory
	java.lang.String getVerticalDatum();
	void setVerticalDatum(java.lang.String VerticalDatum);
	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcCoordinateOperation> getHasCoordinateOperation();
	void setHasCoordinateOperation(java.util.List<ifc4.IfcCoordinateOperation> HasCoordinateOperation);

}
