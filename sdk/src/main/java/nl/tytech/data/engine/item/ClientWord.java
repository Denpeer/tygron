/*******************************************************************************
 * Copyright 2006-2016 TyTech B.V., Saturnusstraat 60, 2516 AH, The Hague, The Netherlands All rights reserved. This software is proprietary
 * information of TyTech B.V..
 ******************************************************************************/
package nl.tytech.data.engine.item;

import nl.tytech.data.core.item.Moment.SimTime;
import nl.tytech.data.core.item.Word;
import nl.tytech.data.engine.serializable.MapType;

/**
 * @author Maxim Knepfle
 */
public class ClientWord extends Word<ClientWord.ClientTerms> {

    public enum ClientTerms implements Word.Terms {

        INFO_CURRENT_PLANNING, INFO_CURRENT_TIMELINE, INFO_MAQUETTE_PLANNING, INFO_MAQUETTE_TIMELINE, NETWORK_FAIL, TIMELINE_CURRENT, TIMELINE_MAQUETTE, PLANNING_CURRENT, PLANNING_MAQUETTE,

        STAKEHOLDER_ASSIGNMENT, STAKEHOLDER_CHOICE,

        STAKEHOLDER_INDICATOR_SCORE, STAKEHOLDER_INFORMATION,

        STAKEHOLDER_WEIGHT, STAKEHOLDER, STAKEHOLDERS, ANDWORD, ANSWER, APPLY,

        BAD, BEAMER_CURRENT_MAPTYPE, BEAMER_FUTURE_MAPTYPE,

        BEAMER_TABLE_TYPE, BEAMER_TABLE_SERVERS, BEAMER_TABLE_STATUS, BEAMER_TABLE_RELEASE, BEAMER_TABLE_COMPUTER_NAME,

        BEAMER_GLOBAL_SCREEN, BEAMER_INDICATOR_SCREEN, BEAMER_INTRO_SCREEN, BEAMER_LAYER_TYPE, BEAMER_MAP_SCREEN, BEAMER_WEBVIEW_SCREEN, BEAMER_MAP_TYPE,

        BEAMER_PLAYER_SCORETYPE, BEAMER_PREVIEW, BEAMER_SCORE_SCREEN, BEAMER_HEAT_SCREEN,

        BEAMER_TEAM_SCORETYPE, BEAMER_TEAM_NAME_TITLE, BEAMER_TITLE, BEAMER_BASE_OVERLAY,

        BEAMER_PANEL_MODUS, BEHAVIOUR_BEACH, BEHAVIOUR_BOEZEM_WATER, BEHAVIOUR_BREAKWATER, BEHAVIOUR_CONCRETE, BEHAVIOUR_DUNES,

        BEHAVIOUR_GRASSLAND, BEHAVIOUR_POLDER_WATER,

        BUDGET, BUDGET_AMOUNT, BUDGET_BALANCE, BUDGET_ITEM,

        BUDGET_PERSONAL_BUDGET_ABRV, BUDGET_PERSONAL_EXPENSES, BUDGET_PERSONAL_INCOME, BUDGET_SHARED_BUDGET_ABRV, BUILD, BUILDING_FINISH_DATE, BUILDING_NAME,

        BUILDING_OWNER, BUILDING_PERCENTAGE_COMPLETE, BUILDING_RENTER, BUILDING_START_DATE,

        BUILDING_STATE, BUTTON_NEW, BUY, BUY_FROM,

        BUY_LAND, BUY_PRICE, BUY_SELL_LAND_CALCULATION_EXPL,

        BUY_SELL_LAND_MAXIMUM_AMOUNT, BUY_SELL_LAND_MINIMUM_AMOUNT, CANCEL,

        CATEGORY_INFORMATION_OVER_BUDGET, CATEGORY_PANEL_SELECTION,

        CHARACTERMENU_INTRO,

        CLOSE, COMMUNICATION_KEEP_MESSAGE,

        CONSTRUCTION_FINISHES_ON,

        CONSTRUCTION_STARTED_ON, CONSTRUCTION_STARTS_ON, CONTINUE, COST_CONSTRUCTION, COST_CONTRIBUTION, COST_DEFAULT, COST_DEMOLISH,

        COST_MAINTENANCE, COST_RESERVED_CONSTRUCTION, COST_RESERVED_DEMOLISH,

        COST_RESERVED_UPGRADE, COST_UPGRADE, COSTS, CREDITS, CRITERIA_BUY_SELF_OWNED,

        CRITERIA_DISTANCE_BEHAVIOR, CRITERIA_DISTANCE_ROAD,

        CRITERIA_EMPTY, CRITERIA_ENOUGH_BUDGET, CRITERIA_FUNCTION_CATEGORY,

        CRITERIA_MEASURE_PRESENT, CRITERIA_ONLY_LAND, CRITERIA_ONLY_WATER, CRITERIA_OWNED, CRITERIA_OWNED_BY_YOU,

        CRITERIA_PLAN_AREA, CRITERIA_RAISABLE, CRITERIA_READY, CRITERIA_REVERTABLE, CRITERIA_UPGRADE, CRITERIA_VACANT, CURRENT_LAND_VALUE, DATE, DEFAULT_WISHES, DEMOLISH_FINISHES_ON,

        DEMOLISH_STARTED_ON, DEMOLISH_STARTS_ON, DETAIL_DEMOLISH_COST, DETAIL_M2_SELLABLE_FLOORSPACE, DETAIL_NUMBER_HOUSES, DETAIL_NUMBER_UNITS, DETAIL_PARKING_SPACES, DETAIL_SELL_PRICE, DETAIL_WATER_STORAGE,

        DISPLAY,

        DISTANCE_MIN, ECONOMY, EMAIL_TO,

        EXPLANATION, EXPLANATION_INDICATOR, FEEDBACK_PAUSE, FEEDBACK_PROCESSING,

        FINANCE,

        FUNCTION_CATEGORY_OFFICES,

        FUNCTION_CATEGORY_EDUCATION, FUNCTION_CATEGORY_HEALTHCARE,

        FUNCTION_CATEGORY_INDUSTRY, FUNCTION_CATEGORY_LUXE, FUNCTION_CATEGORY_NATURE, FUNCTION_CATEGORY_NORMAL, FUNCTION_CATEGORY_OTHER, FUNCTION_CATEGORY_PARK, FUNCTION_CATEGORY_PAVED_AREA, FUNCTION_CATEGORY_ROAD, FUNCTION_CATEGORY_SENIOR,

        FUNCTION_CATEGORY_SOCIAL, FUNCTION_CATEGORY_UNDERGROUND, FUNCTION_CATEGORY_UNDERGROUND_WITH_TOP_BUILDING, FUNCTION_CATEGORY_WATER,

        FUNCTION_FLOOR_AREA, FUNCTION_HEAT_INFLUENCE, FUNCTION_INCOME, FUNCTION_PARKING, FUNCTION_PHYSICAL, FUNCTION_UNITS, FUNCTION_WATER_STORAGE,

        FUNCTION_WATER_STORAGE_M3,

        GLOBAL_CURRENT_SESSION_TIME, GLOBAL_SESSION_SPEED, GLOBAL_SESSIONS_NOT_SAVED, GLOBAL_SESSIONS_SAVED, GLOBAL_NEXT_PAUSE, GLOBAL_PAUSE_LABEL, GLOBAL_SAVE_BUTTON, GLOBAL_SAVE_BUTTON_BUSY, GLOBAL_SAVE_LABEL,

        GLOBAL_TITLE, GLOBAL_UNPAUSE_LABEL, GOOD, GREEN, HOUSES, HOUSING, HOVER_INFORMATION_APPLY_BUTTON,

        HOVER_INFORMATION_SELECT_SELL_LAND, HOVER_INFORMATION_SELECT_UPGRADE, HOVER_INFORMATION_SELECTED,

        IMPOSSIBLE, INBOX_TITLE,

        INCOME_DEFAULT, INCOME_INITIAL, INCOME_LAND_SALES, INCOME_LOAN, INCOME_SALES,

        INCOME_START_BUDGET, INDICATOR_ACTIVATE, INDICATOR_DEACTIVATE, INDICATOR_GRAPH_VALUE_AXIS_LABEL, INDICATOR_SHARED_EXPLANATION,

        INDICATOR_TITLE, INDICATORS_ASSIGNMENT, INDICATORS_CURRENT_SCORE, INDICATORS_IMPORTANCE,

        INDICATORS_SCORE, INDICATORS_TOTALSCORE, INFO, INFO_LABEL, INFO_PANEL_CHOOSE_SCENARIO,

        INNOVATIVE,

        LEVEL, LEVEL_ACTIVE, LEVELS_TITLE,

        LOAN_PANEL_AMOUNT, LOAN_PANEL_INTREST, LOAN_PANEL_INTRO,

        LOAN_PANEL_LOAN, LOAN_PANEL_NEW_LOAN, LOAN_PANEL_REMAINING,

        LOAN_PANEL_TITLE, LOAN_PANEL_TOTAL, LOAN_PANEL_YEARS,

        MAIN_AYS_TEXT, MAIN_AYS_TITLE, MAIN_GLOBAL_BUTTON, MAIN_TEAM_BUTTON,

        MAQUETTE, MAXIMUM_AMOUNT_OF_MONEY, MEASURE_ADD_NEW_SUBTITLE, MEASURE_ADJUST_TITLE,

        MEASURE_CONSTRUCTED_BY, MEASURE_MAINTENANCE_COSTS_PER_YEAR,

        MEASURE_NO_STAKEHOLDER_ERROR, MEASURE_SAVED, MEASURE_STORAGE, MEASURE_TITLE,

        MENU_IN_VIEWPORT_CONFIRM,

        MENU_IN_VIEWPORT_CREDITS, MENU_IN_VIEWPORT_EXIT, MENU_IN_VIEWPORT_SAVE, MENU_IN_VIEWPORT_SETTINGS, MENU_IN_VIEWPORT_SURE,

        MENU_IN_VIEWPORT_TITLE, MESSAGE_DATE, MESSAGE_FEEDBACK, MESSAGE_FROM, MESSAGE_ALL_STAKEHOLDERS, MESSAGE_MESSAGE, MESSAGE_MOTIVATION, MESSAGE_REPLY,

        MESSAGE_SUBJECT, MESSAGE_TITLE_COMPOSE, MESSAGE_TITLE_INBOX, MESSAGE_TITLE_OUTBOX,

        MESSAGE_TO, MONEY_TRANSFER, MONEY_TRANSFER_DESCRIPTION, SELECTION_OK, MONEY_TRANSFER_TO, MONEY_TRANSFER_TO_OTHER_PLAYER, MOTIVATE, NAME, NEGATIVE_BUDGET,

        NO, NORMAL, NOT_A_VALID_NUMBER, NOT_ENOUGHT_MONEY,

        NOTHING_SET,

        OK, OPEN, OPEN_WATER_FLOODING,

        OPEN_WATER_FLOODING_EXPL,

        PLAYER, PLAYER_SCORE, PLAYTIME_ROUND, POLDER_WATER,

        PRESENT, PROCESSING, PROCESSING_LOWER, PROGRESS, PROPOSE,

        RELEASED_FROM_SESSION, ADD, REMOVE, RESET, RESPOND, RESTORE, RESULT, REVOKE, RIVER, RIVER_EXPL,

        SAVE, SCORE,

        SELECTED, SELL, SELL_LAND, SELL_PRICE, SELL_TO, SEND, SEND_MESSAGE, SENDER_NAME_TO_EVERYONE, SERVER_SESSIONS,

        SERVER_WAITING_QUEUE, SESSION, SET,

        SETTINGS_ADVANCED_BUTTON, SETTINGS_ANTI_ALIASING, SETTINGS_BLOOM,

        SETTINGS_CARTOON, SETTINGS_CUSTOM_TITLE, SETTINGS_DISPLAY_TITLE, SETTINGS_DOF, SETTINGS_DRAW_DISTANCE, SETTINGS_EFFECT_TITLE, SETTINGS_ENVIRONMENT_TITLE, SETTINGS_HIGH, SETTINGS_LOW,

        SETTINGS_NORMAL,

        SETTINGS_OFF, SETTINGS_ON, SETTINGS_PRESET_TITLE, SETTINGS_RECOMMENDED, SETTINGS_SHADOW, SETTINGS_SSAO, SETTINGS_SUN_SCATTER, SETTINGS_TEXTURE_QUALITY, SETTINGS_TEXTURE_TITLE,

        SETTINGS_TITLE, SETTINGS_ULTRA, SETTINGS_ULTRA2, SETTINGS_WATER, SHARED_INDICATORS, SHOW,

        SOCIAL,

        STATE_CONSTRUCTING, STATE_CONSTRUCTION_APPROVED, STATE_CONSTRUCTION_DENIED, STATE_DEMOLISH_APPROVED, STATE_DEMOLISH_DENIED, STATE_DEMOLISH_FINISHED, STATE_PENDING_UPGRADE, STATE_DEMOLISHING, STATE_NOTHING,

        STATE_PENDING_CONSTRUCTION, STATE_PENDING_DEMOLISHING, STATE_READY, STATE_REQUEST_ZONING_APPROVAL, STATE_REQUEST_CONSTRUCTION_APPROVAL, STATE_REQUEST_DEMOLISH_APPROVAL, STATE_WAITING_FOR_CONSTRUCTION_DATE, STATE_WAITING_FOR_DEMOLISH_DATE, STATUS_NO_PLAYERS, STATUS_PLAYERS_CONNECTED,

        SUBSIDY, SUBSIDY_AMOUNT, SUBSIDY_AMOUNT_ERROR, SUBSIDY_STAKEHOLDER_ERROR, SUBSIDY_FROM_OTHER_PLAYER, SUBSIDY_GRANT, SUBSIDY_GRANT_EXISTING, SUBSIDY_GRANTED, SUBSIDY_MINIMUM_AMOUNT, SUBSIDY_NEW,

        SUBSIDY_NOT_GRANTED, SUBSIDY_NOT_VALID_NUMBER, SUBSIDY_OVERVIEW, SUBSIDY_REASON, SUBSIDY_RECEIVER, SUBSIDY_REQUEST, SUBSIDY_SENDER, SUBSIDY_SET, SUBSIDY_SUBJECT_ERROR, SUBSIDY_TITLE, TEAMNAME_SETUP,

        TEAMNAME_TUTORIAL,

        TILE_HEAT_EFFECT_IMMEDIATE_SURROUNDINGS, TILE_HOLD_WATER, TILE_MEASURE, TILE_OUTSIDE_PLAN_AREA, TILE_OWNER, TILE_PHYSICAL_QOL_IMMEDIATE_SURROUNDINGS, TILE_QUALITY_OF_LIFE_NEIGHBOURHOOD, TILE_SURFACE_WATER, TILE_TOTAL_STORAGE, TILE_WATER_STORAGE_PER_M2,

        TOTAL, UPGRADE, WAITERS, WATER_STORAGE,

        WRITE,

        YES, FLOORS, FUNCTION_CATEGORY_DIKE, FUNCTION_CATEGORY_SHOPPING, QUALITATIVE_FUNCTION_MAX_POSTFIX, CONSTRUCTION_PERIOD, CONSTRUCTION_PERIOD_UNIT, DEMOLISH_PERIOD_UNIT, MONTHS, FUNCTION_CATEGORY_AGRICULTURE, FUNCTION_CATEGORY_LEISURE, FUNCTION_CATEGORY_STUDENT, FUNCTION_CATEGORY_GARDEN,

        LAST_MOMENT_REACHED,

        CLOSE_ALL_SESSIONS_EXIT, FACILIATOR_TEAM_SERVER,

        CRITERIA_DEMOLISHABLE, CRITERIA_RESERVED, CRITERIA_BUILDING, CRITERIA_ZONE, CRITERIA_HOTSPOT, CRITERIA_TERRAIN, CRITERIA_FLAT, CRITERIA_DIAGONALY_OPPOSITE, CRITERIA_EMPTY_FOR_DIKE, PRICE, SURFACE,

        CRITERIA_ZONE_REMOVE,

        CRITEREA_MEASURE_BUILDING_PRESENT, WATER_STORAGE_IN_UNIT, PER_UNIT, AMOUNT_OF_RAIN_IN_X_DURING_PERIOD, DURATION_OF_RAINFALL_IN_MINUTES, ANNUAL_RAINFALL_INCREMENT_IN_X, ENVIRONMENT_EFFECT, AIR_POLLUTION_EFFECT, DISTANCE_ZONE, UNIT_FLOORSPACE,

        CONSTRUCTION_COST, LEVEL_FINANCIAL_INCREMENT, TILE_HEAT_EFFECT_UNIT, MIN_FLOORS, MAX_FLOORS,

        HEAT_FLOW_M2_YEAR, HEAT_FLOW_M2_START_VALUE, HEAT_FLOW_M2_START_YEAR, HEAT_FLOW_M2_CHANGE_PER_YEAR, HEAT_POWER_TO_FLOW_MULTIPLIER,

        DEMAND, LOSS, SUPPLY, NOT_CONNECTED, PRODUCT_SALES, PRODUCTION_TAX, EXCISE_TAX, EXPORT_TAX, IMPORT_TAX, PRODUCT_PURCHASES, PRODUCTION, PRODUCT_TRANSPORTATION, ZONING_PERMIT_REQUIRED,

        DEFAULT_FLOOR_HEIGHT,

        EQUALS, BETWEEN, UNDER, ABOVE, STARTS_WITH, END_WITH, CONSTRUCTIONS, LANDSCAPE, INCLUDE_ALL, DEFAULT_FLOORS, DEMOLISH, PLAYTIME, MEASURE, SWITCH_PLAYER, CLICK_FOR_MORE, CATEGORY_WEIGHT, ZONE_MAXIMUM_ALLOWED_FLOORS,

        ZONE_ALLOWED_CATEGORIES, DETAIL_BUYOUT_COST, COST_BUYOUT, HOVER_INFORMATION_TIME_PLANNING, HOVER_INFORMATION_TIME_TIMELINE, HOVER_INFORMATION_STAKEHOLDER, SHOW_OVERLAY, VACANT, OTHER, AVERAGE, ZONINGPLAN, EXCEPTION, MINIMIZE, ADDED, REMOVED, ZONE_PLAN_CHANGE, INBOX, SLANTING_ROOF_HEIGHT, PIPES_PERMITTED, BEHAVIOUR_DIKE,

        PER_SURFACE_SPACE, PER_FLOOR_SPACE, FLOOR_SPACE, DESCRIPTION, IMAGE, ROOFCOLOR, WALLCOLOR, CRITERIA_INCORRECT_PLACEMENT, CRITERIA_MULTI_FUCTION, GROUND_HEIGHT,

        CRITERIA_PIPE_FLOWGROUP, CRITERIA_PIPE_FLOWGROUP_REMOVE, SEARCH_FOR_ADDRESS, YEAR_OF_CONSTRUCTION, CRITERIA_BEHAVIOR, CRITERIA_MEASURE_BUILDING_BEHAVIOR, DIKE_HEIGHT, DIKE_WIDTH, DISCONNECT, CONNECT,

        HEAT_BEAMER_CONNECTIONS, HEAT_BEAMER_SESSION, HEAT_BEAMER_DELIVERY, HEAT_BEAMER_CO2, HEAT_BEAMER_BAK, HEAT_BEAMER_CO2_REDUCTION_FIELDS, YEAR, HEAT_BEAMER_PROFIT, HEAT_ADJUST_PRICES, HEAT_ADVISE_BAK, HEAT_VAR_TRANSPORT, HEAT_BAK, RESPONSE, TRAFFIC_FLOW, TRAFFIC_SPEED, TRAFFIC_LANES, COOL, OVERHEATED, QUIET, BUSY, CRITERIA_NO_BUILDING, CRITERIA_MEASURE_SPATIAL_DEMOLISH, CRITERIA_MEASURE_SPATIAL,

        HEAT_FIXED_TRANSPORT, HEAT_RETURN_ON_INVESTMENT, HEAT_POWER, HEAT_GAS_BUY, HEAT_ENERGY_BUY, HEAT_ENERGY_SELL, HEAT_GAS_SELL, HEAT_FIXED_GAS_SELL, HEAT_AVAILABILITY, HEAT_WEQ, CONFIRM, TRAFFIC_NOISE_SIGMA, TRAFFIC_NOISE_TAU, FUNCTION_CATEGORY_INTERSECTION, FUNCTION_CATEGORY_BRIDGE, CALCULATING,

        NOISE, BUILDING_HEIGHT, NO2_TRAFFIC, GRID_CELL, FLOATING, DRAINAGE, ZONE, CURRENT,

        ACTION_LOG_BUILD, ACTION_LOG_DEMOLISH, ACTION_LOG_UPGRADE, ACTION_LOG_REVERT, ACTION_LOG_LOWER_LAND, ACTION_LOG_RAISE_LAND, ACTION_LOG_DIKE, ACTION_LOG_APPLIED, ACTION_LOG_MEASURE_BUILD, ACTION_LOG_MEASURE_CANCEL, ACTION_LOG_MEASURE_DEMOLISH, ACTION_LOG_RESTORED_LAND;

    }

    private static final long serialVersionUID = 8819290445496645730L;

    public static ClientTerms getMapTypeClientTerm(MapType mapType, SimTime simTimeType) {
        String currentName = simTimeType + "_" + mapType.name();
        return ClientTerms.valueOf(currentName);
    }

    @Override
    public ClientTerms[] getEnumValues() {
        return ClientTerms.values();
    }
}
