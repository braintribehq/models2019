/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcFillAreaStyleTiles of the Data Model iai.
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
{@link TilingPattern}, 
{@link Tiles}, 
{@link TilingScale}, 
{@link TilingScaleAsString}, 

* It provides of then following operations (getters and setters)
{@link getTilingPattern},
{@link getTiles},
{@link getTilingScale},
{@link getTilingScaleAsString},
{@link setTilingPattern},
{@link setTiles},
{@link setTilingScale},
{@link setTilingScaleAsString},
 */

@Description("")

public interface IfcFillAreaStyleTiles extends GenericEntity, ifc4.IfcGeometricRepresentationItem, ifc4.IfcFillStyleSelect {

	EntityType<IfcFillAreaStyleTiles> T = EntityTypes.T(IfcFillAreaStyleTiles.class);

	/* Constants for each property name. */
	java.lang.String TilingPattern = "TilingPattern";
	java.lang.String Tiles = "Tiles";
	java.lang.String TilingScale = "TilingScale";
	java.lang.String TilingScaleAsString = "TilingScaleAsString";

	@Description("")
	
	java.util.List<ifc4.IfcVector> getTilingPattern();
	void setTilingPattern(java.util.List<ifc4.IfcVector> TilingPattern);

	@Description("")
	
	java.util.List<ifc4.IfcStyledItem> getTiles();
	void setTiles(java.util.List<ifc4.IfcStyledItem> Tiles);

	@Description("")
	@Mandatory
	java.lang.Double getTilingScale();
	void setTilingScale(java.lang.Double TilingScale);
	@Description("")
	@Mandatory
	java.lang.String getTilingScaleAsString();
	void setTilingScaleAsString(java.lang.String TilingScaleAsString);
}
