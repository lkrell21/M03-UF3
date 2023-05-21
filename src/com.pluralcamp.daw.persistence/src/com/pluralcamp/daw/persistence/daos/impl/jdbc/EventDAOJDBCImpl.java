package com.pluralcamp.daw.persistence.daos.impl.jdbc;

import com.pluralcamp.daw.entities.core.Event;
import com.pluralcamp.daw.persistence.daos.contracts.EventDAO;
import com.pluralcamp.daw.persistence.exceptions.DAOException;

import java.util.List;

public class EventDAOJDBCImpl implements EventDAO {
    @Override
    public Event getEventById(long id) throws DAOException {
        return null;
    }

    @Override
    public List<Event> getEvents() throws DAOException {
        return null;
    }

    @Override
    public List<Event> getEvents(int offset, int count) throws DAOException {
        return null;
    }

    @Override
    public List<Event> getEvents(String searchTerm) throws DAOException {
        return null;
    }

    @Override
    public List<Event> getEvents(String searchTerm, int offset, int count) throws DAOException {
        return null;
    }

    @Override
    public List<Event> getEvents(boolean visible, String searchTerm) throws DAOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEvents'");
    }

    @Override
    public List<Event> getEvents(boolean visible, String searchTerm, int offset, int count) throws DAOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEvents'");
    }

    @Override
    public List<Event> getCurrentWeekEvents() throws DAOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurrentWeekEvents'");
    }

    @Override
    public List<Event> getCurrentMonthEvents() throws DAOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurrentMonthEvents'");
    }
}
