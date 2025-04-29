SELECT c.id, c.name, o.id, o.item_id, o.item_quantity
FROM ORDERS o, CUSTOMERS c;

SELECT c.id, c.name, o.id, o.item_id, o.item_quantity
FROM ORDERS o
         JOIN CUSTOMERS c ON o.customer_id = o.id;

SELECT f.name, d.title, l.*
FROM FOLDERS f, DOCUMENTS d, DOC_LINES l
WHERE f.id = d.folder_id;