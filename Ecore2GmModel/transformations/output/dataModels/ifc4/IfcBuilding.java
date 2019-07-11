/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcBuilding of the Data Model iai.
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
{@link ElevationOfRefHeight}, 
{@link ElevationOfRefHeightAsString}, 
{@link ElevationOfTerrain}, 
{@link ElevationOfTerrainAsString}, 
{@link BuildingAddress}, 

* It provides of then following operations (getters and setters)
{@link getElevationOfRefHeight},
{@link getElevationOfRefHeightAsString},
{@link getElevationOfTerrain},
{@link getElevationOfTerrainAsString},
{@link getBuildingAddress},
{@link setElevationOfRefHeight},
{@link setElevationOfRefHeightAsString},
{@link setElevationOfTerrain},
{@link setElevationOfTerrainAsString},
{@link setBuildingAddress},
 */

@Description("")

public interface IfcBuilding extends GenericEntity, ifc4.IfcSpatialStructureElement {

	EntityType<IfcBuilding> T = EntityTypes.T(IfcBuilding.class);

	/* Constants for each property name. */
	java.lang.String ElevationOfRefHeight = "ElevationOfRefHeight";
	java.lang.String ElevationOfRefHeightAsString = "ElevationOfRefHeightAsString";
	java.lang.String ElevationOfTerrain = "ElevationOfTerrain";
	java.lang.String ElevationOfTerrainAsString = "ElevationOfTerrainAsString";
	java.lang.String BuildingAddress = "BuildingAddress";

	@Description("")
	@Mandatory
	java.lang.Double getElevationOfRefHeight();
	void setElevationOfRefHeight(java.lang.Double ElevationOfRefHeight);
	@Description("")
	@Mandatory
	java.lang.String getElevationOfRefHeightAsString();
	void setElevationOfRefHeightAsString(java.lang.String ElevationOfRefHeightAsString);
	@Description("")
	@Mandatory
	java.lang.Double getElevationOfTerrain();
	void setElevationOfTerrain(java.lang.Double ElevationOfTerrain);
	@Description("")
	@Mandatory
	java.lang.String getElevationOfTerrainAsString();
	void setElevationOfTerrainAsString(java.lang.String ElevationOfTerrainAsString);
	@Description("")
	@Mandatory
	ifc4.IfcPostalAddress getBuildingAddress();
	void setBuildingAddress(ifc4.IfcPostalAddress BuildingAddress);
}
