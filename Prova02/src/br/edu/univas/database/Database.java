package br.edu.univas.database;

import br.edu.univas.vo.Doador;

import java.util.*;

public class Database {

    private static List<Doador> doadores = new ArrayList();
    private static Map<String, Long> estoqueSanguineo = new Map<String, Long>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public Long get(Object key) {
            return null;
        }

        @Override
        public Long put(String key, Long value) {
            return null;
        }

        @Override
        public Long remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends String, ? extends Long> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<String> keySet() {
            return null;
        }

        @Override
        public Collection<Long> values() {
            return null;
        }

        @Override
        public Set<Entry<String, Long>> entrySet() {
            return null;
        }
    };

    public static void addDoador(Doador doador) {
        doadores.add(doador);

    }

    public static void addDoacao(String tipoSanguineo, Long quantidade) {
        estoqueSanguineo.put(tipoSanguineo, quantidade);

    }

    public static Long getSituacaoEstoque(String tipoSanguineo) {
        return estoqueSanguineo.get(tipoSanguineo);

    }

}
